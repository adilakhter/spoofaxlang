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

@SuppressWarnings("all") public class construct_list_fragments_1_1 extends Strategy 
{ 
  public static construct_list_fragments_1_1 instance = new construct_list_fragments_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4272, IStrategoTerm z_4271)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("construct_list_fragments_1_1");
    Fail25863:
    { 
      IStrategoTerm a_4272 = null;
      IStrategoTerm b_4272 = null;
      IStrategoTerm l_4272 = null;
      term = at_suffix_1_0.instance.invoke(context, term, lifted9285.instance);
      if(term == null)
        break Fail25863;
      term = split_init_last_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25863;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25863;
      a_4272 = term.getSubterm(0);
      b_4272 = term.getSubterm(1);
      term = a_4272;
      IStrategoTerm term10294 = term;
      Success10228:
      { 
        Fail25864:
        { 
          IStrategoTerm d_4272 = null;
          d_4272 = term;
          IStrategoTerm term10295 = term;
          Success10229:
          { 
            Fail25865:
            { 
              if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                break Fail25865;
              if(true)
                break Success10229;
            }
            term = term10295;
            IStrategoTerm term10296 = term;
            Success10230:
            { 
              Fail25866:
              { 
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail25866;
                IStrategoTerm arg6241 = ((IStrategoList)term).tail();
                if(arg6241.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6241).isEmpty())
                  break Fail25866;
                if(true)
                  break Success10230;
              }
              term = origin_sublist_term_0_0.instance.invoke(context, term10296);
              if(term == null)
                break Fail25864;
            }
          }
          term = d_4272;
          { 
            term = construct_list_fragments_base_1_1.instance.invoke(context, term, e_4272, z_4271);
            if(term == null)
              break Fail25863;
            if(true)
              break Success10228;
          }
        }
        term = this.invoke(context, term10294, e_4272, z_4271);
        if(term == null)
          break Fail25863;
      }
      l_4272 = term;
      term = construct_list_fragments_base_1_1.instance.invoke(context, b_4272, e_4272, z_4271);
      if(term == null)
        break Fail25863;
      term = (IStrategoTerm)termFactory.makeListCons(l_4272, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25863;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}