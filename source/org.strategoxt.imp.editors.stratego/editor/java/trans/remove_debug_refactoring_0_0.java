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

@SuppressWarnings("all") public class remove_debug_refactoring_0_0 extends Strategy 
{ 
  public static remove_debug_refactoring_0_0 instance = new remove_debug_refactoring_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("remove_debug_refactoring_0_0");
    Fail22717:
    { 
      IStrategoTerm w_4716 = null;
      IStrategoTerm x_4716 = null;
      IStrategoTerm y_4716 = null;
      IStrategoTerm z_4716 = null;
      IStrategoTerm a_4717 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail22717;
      w_4716 = term.getSubterm(1);
      term = bottomup_1_0.instance.invoke(context, w_4716, lifted6698.instance);
      if(term == null)
        break Fail22717;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(w_4716, term), (IStrategoList)trans.constNil4);
      x_4716 = term;
      y_4716 = trans.constNil4;
      z_4716 = trans.constNil4;
      a_4717 = trans.constNil4;
      term = termFactory.makeTuple(y_4716, z_4716);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22717;
      term = termFactory.makeTuple(x_4716, trans.constNil4, term, a_4717);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}