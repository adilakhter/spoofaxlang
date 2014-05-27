package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class throw_$Is$Imported_1_1 extends Strategy 
{ 
  public static throw_$Is$Imported_1_1 instance = new throw_$Is$Imported_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4642, IStrategoTerm i_4642)
  { 
    context.push("throw_IsImported_1_1");
    Fail23004:
    { 
      IStrategoTerm l_4642 = null;
      l_4642 = term;
      term = dr_throw_1_2.instance.invoke(context, l_4642, j_4642, i_4642, trans.const4487);
      if(term == null)
        break Fail23004;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}