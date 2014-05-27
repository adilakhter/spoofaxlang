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

@SuppressWarnings("all") public class sdf2table_0_0 extends Strategy 
{ 
  public static sdf2table_0_0 instance = new sdf2table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sdf2table_0_0");
    Fail26587:
    { 
      IStrategoTerm z_4363 = null;
      IStrategoTerm a_4364 = null;
      IStrategoTerm b_4364 = null;
      IStrategoTerm term10952 = term;
      Success10808:
      { 
        Fail26588:
        { 
          IStrategoTerm d_4364 = null;
          IStrategoTerm h_4364 = null;
          IStrategoTerm e_4364 = null;
          IStrategoTerm i_4364 = null;
          IStrategoTerm f_4364 = null;
          IStrategoTerm j_4364 = null;
          IStrategoTerm g_4364 = null;
          IStrategoTerm k_4364 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail26588;
          z_4363 = term.getSubterm(0);
          a_4364 = term.getSubterm(1);
          b_4364 = term.getSubterm(2);
          h_4364 = term;
          term = abspath_0_0.instance.invoke(context, z_4363);
          if(term == null)
            break Fail26588;
          d_4364 = term;
          i_4364 = h_4364;
          term = abspath_0_0.instance.invoke(context, a_4364);
          if(term == null)
            break Fail26588;
          e_4364 = term;
          term = i_4364;
          j_4364 = i_4364;
          term = get_sdf_main_module_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26588;
          f_4364 = term;
          term = j_4364;
          k_4364 = j_4364;
          term = pass_v_verbose_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26588;
          term = termFactory.makeTuple(b_4364, term);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26588;
          g_4364 = term;
          term = k_4364;
          IStrategoList list404;
          list404 = checkListTail(g_4364);
          if(list404 == null)
            break Fail26588;
          term = (IStrategoTerm)termFactory.makeListCons(generator.const7051, termFactory.makeListCons(d_4364, termFactory.makeListCons(generator.const6985, termFactory.makeListCons(e_4364, termFactory.makeListCons(generator.const7098, termFactory.makeListCons(f_4364, list404))))));
          term = xtc_command_1_0.instance.invoke(context, term, lifted9480.instance);
          if(term == null)
            break Fail26588;
          if(true)
            break Success10808;
        }
        term = term10952;
        IStrategoTerm term10953 = term;
        Success10809:
        { 
          Fail26589:
          { 
            IStrategoTerm c_4364 = null;
            c_4364 = term;
            term = xtc_command_1_0.instance.invoke(context, generator.constCons4966, lifted9481.instance);
            if(term == null)
              break Fail26589;
            term = c_4364;
            { 
              IStrategoTerm o_4364 = null;
              o_4364 = term;
              term = fatal_err_0_1.instance.invoke(context, o_4364, generator.constCons4967);
              if(term == null)
                break Fail26587;
              if(true)
                break Success10809;
            }
          }
          term = term10953;
          IStrategoTerm q_4364 = null;
          q_4364 = term;
          term = fatal_err_0_1.instance.invoke(context, q_4364, generator.constCons4968);
          if(term == null)
            break Fail26587;
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