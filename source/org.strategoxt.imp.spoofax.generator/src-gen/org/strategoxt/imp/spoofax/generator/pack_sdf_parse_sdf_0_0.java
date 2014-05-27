package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class pack_sdf_parse_sdf_0_0 extends Strategy 
{ 
  public static pack_sdf_parse_sdf_0_0 instance = new pack_sdf_parse_sdf_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pack_sdf_parse_sdf_0_0");
    Fail25469:
    { 
      IStrategoTerm term10051 = term;
      Success10044:
      { 
        Fail25470:
        { 
          IStrategoTerm k_4222 = null;
          TermReference l_4222 = new TermReference();
          IStrategoTerm m_4222 = null;
          IStrategoTerm n_4222 = null;
          IStrategoTerm p_4222 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail25470;
          m_4222 = term.getSubterm(0);
          k_4222 = term.getSubterm(1);
          term = m_4222;
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeFromPath_1 != ((IStrategoAppl)term).getConstructor())
            break Fail25470;
          n_4222 = term.getSubterm(0);
          p_4222 = n_4222;
          term = guarantee_extension_0_1.instance.invoke(context, p_4222, generator.const7002);
          if(term == null)
            break Fail25470;
          term = remove_extension_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25470;
          if(l_4222.value == null)
            l_4222.value = term;
          else
            if(l_4222.value != term && !l_4222.value.match(term))
              break Fail25470;
          term = k_4222;
          lifted9019 lifted90190 = new lifted9019();
          lifted90190.l_4222 = l_4222;
          term = fetch_elem_1_0.instance.invoke(context, term, lifted90190);
          if(term == null)
            break Fail25470;
          if(true)
            break Success10044;
        }
        term = term10051;
        IStrategoTerm a_4222 = null;
        IStrategoTerm g_4222 = null;
        IStrategoTerm h_4222 = null;
        IStrategoTerm b_4684 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail25469;
        g_4222 = term.getSubterm(0);
        term = g_4222;
        if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludePathName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail25469;
        h_4222 = term.getSubterm(0);
        term = h_4222;
        b_4684 = h_4222;
        term = explode_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25469;
        a_4222 = term;
        term = b_4684;
        IStrategoTerm term10054 = term;
        Success10045:
        { 
          Fail25471:
          { 
            IStrategoTerm c_4684 = null;
            c_4684 = term;
            term = a_4222;
            IStrategoTerm term10055 = term;
            Success10046:
            { 
              Fail25472:
              { 
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail25472;
                IStrategoTerm arg5855 = ((IStrategoList)term).head();
                if(arg5855.getTermType() != IStrategoTerm.INT || 47 != ((IStrategoInt)arg5855).intValue())
                  break Fail25472;
                if(true)
                  break Success10046;
              }
              term = term10055;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail25471;
              IStrategoTerm arg5857 = ((IStrategoList)term).head();
              if(arg5857.getTermType() != IStrategoTerm.INT || 46 != ((IStrategoInt)arg5857).intValue())
                break Fail25471;
            }
            term = c_4684;
            if(true)
              break Success10045;
          }
          term = term10054;
          IStrategoList list367;
          list367 = checkListTail(a_4222);
          if(list367 == null)
            break Fail25469;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7004, termFactory.makeListCons(generator.const7003, list367));
          term = implode_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25469;
        }
        IStrategoTerm term10056 = term;
        Success10047:
        { 
          Fail25473:
          { 
            IStrategoTerm d_4222 = null;
            d_4222 = term;
            term = file_exists_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25473;
            term = d_4222;
            { 
              term = if_verbose1_1_0.instance.invoke(context, term, lifted9020.instance);
              if(term == null)
                break Fail25469;
              term = include_pathname_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25469;
              if(true)
                break Success10047;
            }
          }
          term = term10056;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7007, termFactory.makeListCons(term, (IStrategoList)generator.constCons4545));
          term = fatal_error_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25469;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}