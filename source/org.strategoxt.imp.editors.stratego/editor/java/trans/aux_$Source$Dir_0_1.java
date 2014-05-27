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

@SuppressWarnings("all") public class aux_$Source$Dir_0_1 extends Strategy 
{ 
  public static aux_$Source$Dir_0_1 instance = new aux_$Source$Dir_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_4845)
  { 
    Fail23478:
    { 
      IStrategoTerm y_4845 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail23478;
      IStrategoTerm arg8376 = term.getSubterm(0);
      if(arg8376.getTermType() != IStrategoTerm.STRING || !"1354".equals(((IStrategoString)arg8376).stringValue()))
        break Fail23478;
      y_4845 = term.getSubterm(1);
      term = y_4845;
      if(true)
        return term;
    }
    context.push("aux_SourceDir_0_1");
    context.popOnFailure();
    return null;
  }
}