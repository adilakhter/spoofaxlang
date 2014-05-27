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

@SuppressWarnings("all") public class dedent_line_chars_0_1 extends Strategy 
{ 
  public static dedent_line_chars_0_1 instance = new dedent_line_chars_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4273)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("dedent_line_chars_0_1");
    Fail25874:
    { 
      IStrategoTerm g_4273 = null;
      IStrategoTerm h_4273 = null;
      IStrategoTerm i_4273 = null;
      h_4273 = term;
      IStrategoTerm term10301 = term;
      Success10234:
      { 
        Fail25875:
        { 
          term = termFactory.makeTuple(e_4273, generator.const6964);
          term = lt_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25875;
          term = abs_0_0.instance.invoke(context, e_4273);
          if(term == null)
            break Fail25875;
          term = termFactory.makeTuple(term, generator.const7014);
          term = copy_char_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25875;
          term = explode_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25875;
          term = termFactory.makeTuple(term, h_4273);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25875;
          i_4273 = term;
          if(true)
            break Success10234;
        }
        term = term10301;
        IStrategoTerm term10302 = term;
        Success10235:
        { 
          Fail25876:
          { 
            IStrategoTerm n_4273 = null;
            term = termFactory.makeTuple(e_4273, generator.const6964);
            term = gt_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25876;
            term = h_4273;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail25876;
            IStrategoTerm arg6243 = ((IStrategoList)term).head();
            if(arg6243.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)arg6243).intValue())
              break Fail25876;
            g_4273 = ((IStrategoList)term).tail();
            n_4273 = g_4273;
            term = dec_0_0.instance.invoke(context, e_4273);
            if(term == null)
              break Fail25876;
            term = this.invoke(context, n_4273, term);
            if(term == null)
              break Fail25876;
            i_4273 = term;
            if(true)
              break Success10235;
          }
          term = term10302;
          Success10236:
          { 
            Fail25877:
            { 
              IStrategoTerm p_4273 = null;
              term = termFactory.makeTuple(e_4273, generator.const6964);
              term = gt_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25877;
              term = h_4273;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail25877;
              IStrategoTerm arg6244 = ((IStrategoList)term).head();
              if(arg6244.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)arg6244).intValue())
                break Fail25877;
              g_4273 = ((IStrategoList)term).tail();
              p_4273 = g_4273;
              term = termFactory.makeTuple(e_4273, generator.const7141);
              term = subt_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25877;
              term = this.invoke(context, p_4273, term);
              if(term == null)
                break Fail25877;
              i_4273 = term;
              if(true)
                break Success10236;
            }
            term = h_4273;
            i_4273 = h_4273;
          }
        }
      }
      term = i_4273;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}