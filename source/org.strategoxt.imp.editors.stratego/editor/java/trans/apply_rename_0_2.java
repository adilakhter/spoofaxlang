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

@SuppressWarnings("all") public class apply_rename_0_2 extends Strategy 
{ 
  public static apply_rename_0_2 instance = new apply_rename_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_4187, IStrategoTerm y_4187)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail21376:
    { 
      IStrategoTerm z_4187 = null;
      if(term != x_4187 && !x_4187.match(term))
        break Fail21376;
      term = x_4187;
      IStrategoList annos675 = term.getAnnotations();
      if(annos675.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos675).isEmpty())
        break Fail21376;
      z_4187 = ((IStrategoList)annos675).head();
      IStrategoTerm arg7662 = ((IStrategoList)annos675).tail();
      if(arg7662.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7662).isEmpty())
        break Fail21376;
      term = termFactory.annotateTerm(y_4187, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(z_4187, (IStrategoList)trans.constNil3)));
      if(true)
        return term;
    }
    context.push("apply_rename_0_2");
    context.popOnFailure();
    return null;
  }
}