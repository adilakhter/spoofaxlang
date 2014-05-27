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

@SuppressWarnings("all") public class apply_rename_refactoring_2_2 extends Strategy 
{ 
  public static apply_rename_refactoring_2_2 instance = new apply_rename_refactoring_2_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4186, Strategy a_4187, IStrategoTerm t_4186, IStrategoTerm u_4186)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("apply_rename_refactoring_2_2");
    Fail21372:
    { 
      IStrategoTerm v_4186 = null;
      IStrategoTerm w_4186 = null;
      IStrategoTerm x_4186 = null;
      IStrategoTerm y_4186 = null;
      IStrategoTerm d_4187 = null;
      v_4186 = term;
      d_4187 = v_4186;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(t_4186, u_4186), (IStrategoList)trans.constNil3);
      term = apply_rename_refactoring_2_1.instance.invoke(context, d_4187, z_4186, a_4187, term);
      if(term == null)
        break Fail21372;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21372;
      w_4186 = term.getSubterm(0);
      x_4186 = term.getSubterm(1);
      y_4186 = term.getSubterm(2);
      term = termFactory.makeTuple(w_4186, x_4186, y_4186);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}