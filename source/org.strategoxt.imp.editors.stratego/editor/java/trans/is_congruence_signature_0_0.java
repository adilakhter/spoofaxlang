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

@SuppressWarnings("all") public class is_congruence_signature_0_0 extends Strategy 
{ 
  public static is_congruence_signature_0_0 instance = new is_congruence_signature_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("is_congruence_signature_0_0");
    Fail21588:
    { 
      IStrategoTerm y_4220 = null;
      IStrategoTerm z_4220 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21588;
      y_4220 = term.getSubterm(0);
      z_4220 = term.getSubterm(1);
      IStrategoTerm arg7737 = term.getSubterm(2);
      if(arg7737.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg7737).intValue())
        break Fail21588;
      term = termFactory.makeTuple(y_4220, z_4220);
      term = $Declare$Cookie_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21588;
      term = termFactory.makeTuple(y_4220, z_4220, trans.constNil3);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}