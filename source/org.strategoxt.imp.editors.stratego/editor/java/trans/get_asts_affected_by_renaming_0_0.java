package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_asts_affected_by_renaming_0_0 extends Strategy 
{ 
  public static get_asts_affected_by_renaming_0_0 instance = new get_asts_affected_by_renaming_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_asts_affected_by_renaming_0_0");
    Fail22867:
    { 
      IStrategoTerm b_4746 = null;
      TermReference c_4746 = new TermReference();
      IStrategoTerm d_4746 = null;
      IStrategoTerm e_4746 = null;
      IStrategoTerm f_4746 = null;
      IStrategoTerm g_4746 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22867;
      b_4746 = term.getSubterm(0);
      if(c_4746.value == null)
        c_4746.value = term.getSubterm(1);
      else
        if(c_4746.value != term.getSubterm(1) && !c_4746.value.match(term.getSubterm(1)))
          break Fail22867;
      e_4746 = term.getSubterm(2);
      Success12185:
      { 
        Fail22868:
        { 
          IStrategoTerm i_4746 = null;
          i_4746 = term;
          term = is_global_ref_0_0.instance.invoke(context, b_4746);
          if(term == null)
            break Fail22868;
          term = i_4746;
          { 
            lifted6797 lifted67970 = new lifted6797();
            lifted67970.c_4746 = c_4746;
            term = get_affected_stratego_asts_1_0.instance.invoke(context, term, lifted67970);
            if(term == null)
              break Fail22867;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail22867;
            d_4746 = term.getSubterm(0);
            g_4746 = term.getSubterm(1);
            term = analyze_names_0_0.instance.invoke(context, d_4746);
            if(term == null)
              break Fail22867;
            f_4746 = term;
            if(true)
              break Success12185;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(e_4746, (IStrategoList)trans.constNil4);
        f_4746 = term;
        term = trans.constNil4;
        g_4746 = trans.constNil4;
      }
      term = map_1_0.instance.invoke(context, g_4746, lifted6799.instance);
      if(term == null)
        break Fail22867;
      term = termFactory.makeTuple(f_4746, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}