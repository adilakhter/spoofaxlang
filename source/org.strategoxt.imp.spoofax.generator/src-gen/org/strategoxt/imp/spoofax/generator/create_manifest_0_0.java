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

@SuppressWarnings("all") public class create_manifest_0_0 extends Strategy 
{ 
  public static create_manifest_0_0 instance = new create_manifest_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_manifest_0_0");
    Fail26602:
    { 
      IStrategoTerm v_4366 = null;
      IStrategoTerm term10962 = term;
      Success10814:
      { 
        Fail26603:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7729);
          if(term == null)
            break Fail26603;
          if(true)
            break Success10814;
        }
        term = term10962;
        IStrategoTerm z_4366 = null;
        IStrategoTerm b_4367 = null;
        IStrategoTerm d_4367 = null;
        IStrategoTerm e_4367 = null;
        term = get_main_class_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26602;
        v_4366 = term;
        IStrategoTerm term10963 = term;
        Success10815:
        { 
          Fail26604:
          { 
            term = $Base$Package_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26604;
            if(true)
              break Success10815;
          }
          term = default_package_name_0_0.instance.invoke(context, term10963);
          if(term == null)
            break Fail26602;
        }
        z_4366 = term;
        term = termFactory.makeTuple(generator.const7730, v_4366, generator.const7731, z_4366, generator.const7732, z_4366, generator.const7733, z_4366, generator.const7143);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26602;
        d_4367 = term;
        b_4367 = generator.constCons5061;
        e_4367 = d_4367;
        term = output_text_file_0_2.instance.invoke(context, e_4367, b_4367, generator.const7735);
        if(term == null)
          break Fail26602;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}