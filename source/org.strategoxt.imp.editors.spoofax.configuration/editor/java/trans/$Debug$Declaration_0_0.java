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

@SuppressWarnings("all") public class $Debug$Declaration_0_0 extends Strategy 
{ 
  public static $Debug$Declaration_0_0 instance = new $Debug$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail22936:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDebugDeclaration_0 != ((IStrategoAppl)term).getConstructor())
        break Fail22936;
      if(true)
        return term;
    }
    context.push("DebugDeclaration_0_0");
    context.popOnFailure();
    return null;
  }
}